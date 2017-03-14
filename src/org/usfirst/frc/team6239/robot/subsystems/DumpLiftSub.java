package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DumpLiftSub extends Subsystem {

	@Override
	protected void initDefaultCommand () {

	}



	public void DumpUp () {/// runs in init

		if (!Robot.robotmap.limitswitch1) {
			Robot.robotmap.DumpTalon.set(.6);	
		}
	
		if (!Robot.robotmap.limitswitch2) {
			Robot.robotmap.RearDumpTalon.set(1);	
		}

	}
	
	
	public boolean isDumpUp () {
		
		
		if (Robot.robotmap.limitswitch1) {
			Robot.robotmap.DumpTalon.set(0);	
		}
		
		if (Robot.robotmap.limitswitch2) {
			Robot.robotmap.RearDumpTalon.set(0);	
		}
		
		return (Robot.robotmap.limitswitch1 && Robot.robotmap.limitswitch2);		
	}
	

	public void DumpDown () {
		
		if (!Robot.robotmap.limitswitch3) {
			Robot.robotmap.DumpTalon.set(-.6);	
		}
	
		if (!Robot.robotmap.limitswitch4) {
			Robot.robotmap.RearDumpTalon.set(-1);	
		}		
		
	}
	
	
	public boolean isDumpDown () {
		
		if (Robot.robotmap.limitswitch3) {
			Robot.robotmap.DumpTalon.set(0);	
		}
		
		if (Robot.robotmap.limitswitch4) {
			Robot.robotmap.RearDumpTalon.set(0);	
		}

		return (Robot.robotmap.limitswitch3 && Robot.robotmap.limitswitch4);
	}


	public void DumpStop () {
	
		Robot.robotmap.DumpTalon.set(0);			
		Robot.robotmap.RearDumpTalon.set(0);	
				
	}

	
}
