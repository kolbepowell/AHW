//package com.example;
package net.runelite.client.plugins.helloworld.src.test.java.com.helloworld;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.helloworld.src.main.java.com.helloworld.HelloWorldPlugin;

public class HelloWorldPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HelloWorldPlugin.class);
		RuneLite.main(args);
	}
}