package org.usfirst.frc.team6239.robot.AutoCommands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.Robot;

/**
 * Created by eliwa on 3/15/2017.
 */
public class DriveRobot extends Command {

    public DriveRobot(){
        requires(Robot.DRIVE_SUB);
    }

    @Override
    protected void initialize() {

    }



    @Override
    protected void execute() {

    }

    @Override
    protected void end() {

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void interrupted() {

    }
}
