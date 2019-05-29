/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import javax.swing.JApplet;
import java.applet.AudioClip;

public class SeaCreature {
	
	// 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
	// 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.

	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature ("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();
		SeaCreature Patrick = new SeaCreature ("Patrick");
		Patrick.eat();
		Patrick.laugh();
		SeaCreature Squidward = new SeaCreature ("Squidward");
		Squidward.eat();
		Squidward.laugh();
	}
	

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
		    AudioClip sound = JApplet.newAudioClip(getClass().getResource(this.name + ".wav"));
		    sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
