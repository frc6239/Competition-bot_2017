package org.usfirst.frc.team6239.robot.AutoCommand;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.Robot;

/**
 * Created by eliwa on 3/15/2017.
 */
public class DriveRobot extends Command {
    public double rot,vel;
    public DriveRobot(double rotations,double vel){
        this.rot = rotations;
        this.vel = vel;
        requires(Robot.DRIVE_SUB);
    }

    @Override
    protected void initialize() {
        Robot.DRIVE_SUB.setInitialRotation(Robot.oi.EncoderValue());
        Robot.DRIVE_SUB.tank(this.vel,this.vel);
    }



    @Override
    protected void execute() {
        isFinished();
    }

    @Override
    protected void end() {
        Robot.DRIVE_SUB.tank(0,0);
    }

    @Override
    protected boolean isFinished() {
        return Robot.DRIVE_SUB.AutoDriveCheck(this.rot);
    }

    @Override
    protected void interrupted() {

    }
}
