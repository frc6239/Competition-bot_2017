
package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6239.robot.Robot;

public class DriveCommand extends Command {

    public DriveCommand() {

        requires(Robot.DRIVE_SUB);

    }

    protected void initialize() {
    
    }

    protected void execute() {

    	double LeftJoystickspeed = Robot.oi.stickcontrolerL.getY();
    	double RightJoystickspeed = Robot.oi.stickcontrolerR.getY();
        Robot.DRIVE_SUB.tank(LeftJoystickspeed,RightJoystickspeed);

    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {

        Robot.DRIVE_SUB.tank(0, 0);

    }

    protected void interrupted() {

    }
}
