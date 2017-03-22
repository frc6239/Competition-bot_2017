package org.usfirst.frc.team6239.robot.AutoCommand;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMid extends CommandGroup {

	public AutoMid(){
		System.out.println("AutoMid");
		Robot.autoM = true;
		addSequential(new DriveRobot(1,16.54));
	}
	
	
}
