
package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6239.robot.Robot;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.DRIVE_SUB);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    
    
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double LeftGamepadJoystickspeed =  Robot.oi.gamepad.getRawAxis(0);
    	double RightGamepadJoystickspeed =  Robot.oi.gamepad.getRawAxis(3);
    	//Robot.DRIVE_SUB.tank(LeftGamepadJoystickspeed, RightGamepadJoystickspeed);
    	  
    	double LeftJoystickspeed = Robot.oi.stickcontrolerL.getY();
    	double RightJoystickspeed = Robot.oi.stickcontrolerR.getY();
    	//System.out.println(LeftJoystickspeed);
        Robot.DRIVE_SUB.tank(LeftJoystickspeed,RightJoystickspeed);
        
        //Robot.DRIVE_SUB.arcade(LeftJoystickspeed,RightJoystickspeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
