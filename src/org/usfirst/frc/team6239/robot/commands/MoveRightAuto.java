package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoveRightAuto extends CommandGroup {
public MoveRightAuto(){

	addSequential(new BackupRightCommand(0.5));
	addSequential(new BackupLeftCommand(0.5));
	addSequential(new JumpForwardCommand(0.75));
	
	}
	
	
	
}
