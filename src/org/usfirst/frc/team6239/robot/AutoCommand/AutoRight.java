package org.usfirst.frc.team6239.robot.AutoCommand;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRight extends CommandGroup {
public AutoRight(){
	System.out.println("Auto");
	Robot.autoR = true;
	addSequential(new DriveRobot(1,15.54));
	addSequential(new TurnRobot(90,Robot.oi.EncoderValue(),.4));
	addSequential(new DriveRobot(1,7.5));
	addSequential(new TurnRobot(90,Robot.oi.EncoderValue(),-.4));
	addSequential(new DriveRobot(1,30));
	addSequential(new TurnRobot(51,Robot.oi.EncoderValue(),-.4));
	addSequential(new DriveRobot(1,8.83));
	
}
}
