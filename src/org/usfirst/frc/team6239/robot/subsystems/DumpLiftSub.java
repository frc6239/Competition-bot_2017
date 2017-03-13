package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DumpLiftSub extends Subsystem {

	@Override
	protected void initDefaultCommand () {
		/*
		 *1. Activate 2 motors 
		 *1.25.set dumper up boolean
		 *1.5.RollerGrabber Reversed 
		 *2.Front and rear motors stop at limit switch
		 *
		 * 
         */
	}

	
/* 
  ### STUB CODE - DELETE THIS ###

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
	
  ### END OF STUB CODE ### 
*/

	public void DumpUp () {/// runs in init
	
		/*
		    * 01 Set motors to run forward (front and rear)
		    * 02 front and rear motors stop on limit switch
		    * 03 set dumperUp boolean (so that roller grabber reversed)
		*/		
		
		
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
		
		/*
		    * 01 Set motors to run in reverse (front and rear)
		    * 02 front and rear motors stop on limit switch
		    * 03 set dumperUp boolean (so that roller grabber rotated forward)
		*/			
		
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
		
		boolean bIsDown = (Robot.robotmap.limitswitch3 && Robot.robotmap.limitswitch4);
		
		if (bIsDown)
		{	
			
		}
		
		return bIsDown;		
	}


	public void DumpStop () {
	
		/*
		 	* 01 Set motors to stop (front and rear)
		*/			
		//Robot.robotmap.dumperUp = false;
	
		Robot.robotmap.DumpTalon.set(0);			
		Robot.robotmap.RearDumpTalon.set(0);	
				
	}

	
}
