package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.commands.RollerAccelCommand;

public class RollerAccelerator extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new RollerAccelCommand());
		
	}
	public void RollerAccel() {
		
		Robot.robotmap.RollerAccelTal.set(1);
		
	}


}
