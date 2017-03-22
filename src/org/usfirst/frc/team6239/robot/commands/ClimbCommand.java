package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbCommand extends Command {

	public ClimbCommand(){
	requires(Robot.CLIMBER_SUB); 
	}
	@Override
	protected void end() {

		
	}

	@Override
	protected void execute() {
	
		Robot.CLIMBER_SUB.Climb();
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.CLIMBER_SUB.Hold();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
}
