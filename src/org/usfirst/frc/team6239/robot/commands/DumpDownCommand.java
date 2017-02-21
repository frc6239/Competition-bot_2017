package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DumpDownCommand extends Command
{
	
	public DumpDownCommand() {
		requires(Robot.dump_lift);
	   // setTimeout(3.0); // NEED EXPERIMENTALLY CHOSEN VALUE !!!
	}

	@Override
	protected void initialize () {
		// start the Dumper going down
		Robot.dump_lift.DumpDown();
	}

	@Override
	protected void execute() {
		// nothing to execute (all done in isFinished)
	}
	
	@Override
	protected boolean isFinished() {
		// check if the Dumper is down yet or if timeout has expired
		boolean bIsTimedOut = false;//isTimedOut();
		boolean bIsDumpDown = Robot.dump_lift.isDumpDown();
		
		if (bIsTimedOut && !bIsDumpDown)
		{
			end();
		}
		
		return (bIsTimedOut || bIsDumpDown);
	}

    protected void end() {
    	Robot.dump_lift.DumpStop();
    }

    protected void interrupted() {
    	end();
    }
}
