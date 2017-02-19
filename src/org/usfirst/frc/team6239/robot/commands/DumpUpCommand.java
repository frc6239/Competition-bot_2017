package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DumpUpCommand extends Command{
	
	public DumpUpCommand() {
		requires(Robot.dump_lift);
	}
	
	protected void execute() {
		Robot.dump_lift.DumpUp();
	}
	
	@Override
	protected boolean isFinished() {
		
		return false;
	}

}
