package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.Robot;

/**
 * Created by HighSchoolDude1 on 2/17/2017.
 */
public class RollerGrabberSub extends Subsystem {

    @Override
    protected void initDefaultCommand() {

    }
    public void RollerFront() {
        Robot.robotmap.RollerGrabTal.set(1);
        if (Robot.robotmap.dumperUp || !Robot.robotmap.drivingFront) {
            RollerBack();
        }


    }
    public void RollerBack() {
        Robot.robotmap.RollerGrabTal.set(-1);
    }
}
