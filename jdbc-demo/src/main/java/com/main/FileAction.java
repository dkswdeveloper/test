package com.main;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

interface FileListProvider
{ 
	File[] getFiles();
}
interface MyFileFilter
{
	public boolean accept(File file);
}
interface Action
{
	long actOnFile(File file);
}
interface ResultConsumer
{
	public void consumer(File file, Long count);
}
public class FileAction<R>
{
	FileListProvider provider;
	FileFilter filter;
	Function<File, R> action;
	BiConsumer<File, R> consumer;
	
	public FileAction(FileListProvider provider, FileFilter filter,
			Function<File, R> action, BiConsumer<File, R> consumer)
	{
		super();
		this.provider = provider;
		this.filter = filter;
		this.action = action;
		this.consumer = consumer;
	}
	public void performAction()
	{
		File[] files = provider.getFiles();
		List<File> list = Arrays.stream(files).filter(filter::accept)
		.toList();
		for(File file : list)
		{
			R result = action.apply(file);
			consumer.accept(file, result);
		}
	}
	public static void main(String[] args)
	{
		FileListProvider provider = ()-> { return new File(".").listFiles(); };
		FileFilter filter = (file) -> file.getName().endsWith(".java");
		Function<File,Long> action = (file) -> file.length();
		BiConsumer<File,Long> consumer = (file,len) -> System.out.println(file.getName()+":" + len);
		FileAction<Long> fileAction = new FileAction<Long>(provider, filter,action, consumer);
		fileAction.performAction();
	}
}
