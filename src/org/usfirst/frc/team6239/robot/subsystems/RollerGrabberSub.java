package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.RollerGrabberCommand;

/**
 * Created by HighSchoolDude1 on 2/17/2017.
 */
public class RollerGrabberSub extends Subsystem {

    @Override

    protected void initDefaultCommand() {
        setDefaultCommand(new RollerGrabberCommand());
    }
    public void RollerFront() {
        System.out.println(Robot.robotmap.dumperUp + " " + !Robot.robotmap.driving);


            if (Robot.robotmap.dumperUp) {
                RollerBack();
            } else {
                if (Robot.robotmap.driving) {
                    Robot.robotmap.RollerGrabTal.set(-1);

                } else {
                    Robot.robotmap.RollerGrabTal.set(0);
                }


            }


        }
    
    public void RollerBack() {
        Robot.robotmap.RollerGrabTal.set(1);
    }
    public void Stop() {
        Robot.robotmap.RollerGrabTal.set(0);
    }
}
