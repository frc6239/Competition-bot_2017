package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DumpLiftSub extends Subsystem {

	public DumpLiftSub() {
		
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void Dumping() {
		Robot.robotmap.DumpTalon.set(1);
		
		
	}

	public void DumpDown() {
		Robot.robotmap.DumpTalon.set(-1);
	}
}
