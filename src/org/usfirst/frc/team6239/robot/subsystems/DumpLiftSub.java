package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DumpLiftSub extends Subsystem{


	protected void initDefaultCommand() {

		
	}
	
	public void DumpUp() {
		Robot.robotmap.DumpTalon.set(1);	
		if (Robot.robotmap.limitswitch1) {
			Robot.robotmap.DumpTalon.set(0);
			Robot.robotmap.dumperUp = true;
		}
		
	}
	public void DumpDown() {
		Robot.robotmap.DumpTalon.set(1);
		if (Robot.robotmap.limitswitch2) {
			Robot.robotmap.DumpTalon.set(0);
			Robot.robotmap.dumperUp = false;
		}
	}
	
}
