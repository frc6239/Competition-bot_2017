package org.usfirst.frc.team6239.robot.AutoCommand;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoLeft extends CommandGroup {
public AutoLeft(){
	System.out.println("AutoLeft");
	Robot.autoL = true;
	addSequential(new DriveRobot(1,11.54));
	addSequential(new TurnRobot(90,Robot.oi.EncoderValue(),-.4));
	addSequential(new DriveRobot(1,15));
	addSequential(new TurnRobot(90,Robot.oi.EncoderValue(),.4));
	addSequential(new DriveRobot(1,30));
	addSequential(new TurnRobot(51,Robot.oi.EncoderValue(),.4));
	addSequential(new DriveRobot(1,8.83));
	
}
	
	
	
}
