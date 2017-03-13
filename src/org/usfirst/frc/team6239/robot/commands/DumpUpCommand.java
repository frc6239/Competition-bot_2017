package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DumpUpCommand extends Command{
	
	public DumpUpCommand() {
		requires(Robot.dump_lift);
	    //setTimeout(3.0); // NEED EXPERIMENTALLY CHOSEN VALUE !!!
	}

	@Override
	protected void initialize () {
		// start the Dumper going up
		Robot.dump_lift.DumpUp();
		
	}

	@Override
	protected void execute() {
		// nothing to execute (all done in isFinished)
	}
	
	@Override
	protected boolean isFinished() {
		// check if the Dumper is up yet or if timeout has expired
		boolean bIsTimedOut = false;//isTimedOut();
		boolean bIsDumpUp = Robot.dump_lift.isDumpUp();
		
		if (bIsTimedOut && !bIsDumpUp)
		{
			end();
		}
		
		return (bIsTimedOut || bIsDumpUp);
	}

    protected void end() {
    	Robot.robotmap.dumperUp = false;
    	
    	Robot.dump_lift.DumpStop();
    	
    }

    protected void interrupted() {
    	end();
    }
}
