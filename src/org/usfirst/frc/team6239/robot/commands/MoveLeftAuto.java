package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoveLeftAuto extends CommandGroup {
public MoveLeftAuto(){

	addSequential(new BackupLeftCommand(0.5));
	addSequential(new BackupRightCommand(0.5));
	addSequential(new JumpForwardCommand(0.75));
	
	}
	
	
	
}
