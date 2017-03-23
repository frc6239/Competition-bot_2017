package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class BackupLeftCommand extends Command{
	
	public BackupLeftCommand() {
		requires(Robot.DRIVE_SUB);
	    setTimeout(0.5); // NEED EXPERIMENTALLY CHOSEN VALUE !!!
	}

	@Override
	protected void initialize () {
		Robot.DRIVE_SUB.tank(0.6, 0.5);
	}

	@Override
	protected void execute() {
		// nothing to execute (all done in isFinished)
	}
	
	@Override
	protected boolean isFinished() {
		boolean bIsTimedOut = isTimedOut();
		
		if (bIsTimedOut)
		{
			end();
		}
		
		return (bIsTimedOut);
	}

    protected void end() {    	
    	Robot.DRIVE_SUB.tank(0.0, 0.0);
    	
    }

    protected void interrupted() {
    	end();
    }
}
