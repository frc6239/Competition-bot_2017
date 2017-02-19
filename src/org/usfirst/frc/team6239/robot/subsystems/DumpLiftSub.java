package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DumpLiftSub extends Subsystem{


	protected void initDefaultCommand() {

		
	}

	/*
	* 1. Set motors to run (front and rear)
	* 2. set dumperUp boolean
	* 3. roller grabber reversed
	* 4. front and rear motors stop on limit switch
	* 5. Dumper Down stuff:
	* 	a. both motors go down
	* 	b. stop motor when hit limit switch
	* 	c. when all the way down roller grabber go to default
	* */

	public void DumpUp() {
		Robot.robotmap.DumpTalon.set(1);
		Robot.robotmap.dumperUp = true;
		if (Robot.robotmap.limitswitch1) {
			Robot.robotmap.DumpTalon.set(0);
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
