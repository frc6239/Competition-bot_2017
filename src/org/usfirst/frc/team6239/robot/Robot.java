
package org.usfirst.frc.team6239.robot;


import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

import org.usfirst.frc.team6239.robot.AutoCommand.AutoLeft;
import org.usfirst.frc.team6239.robot.AutoCommand.AutoMid;
import org.usfirst.frc.team6239.robot.AutoCommand.AutoRight;
import org.usfirst.frc.team6239.robot.commands.DumpDownCommand;
import org.usfirst.frc.team6239.robot.commands.DumpUpCommand;
import org.usfirst.frc.team6239.robot.subsystems.Climer_Sub;
import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.DumpLiftSub;
import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;



public class Robot extends IterativeRobot {

	public static boolean autoL;;
	public static boolean autoR;
	public static boolean autoM;
	
    public static boolean input1;
    public static boolean input2;
    public static boolean input3;
    public static DriveSubsystem DRIVE_SUB;
    public static OI oi;
    public static DumpLiftSub dump_lift;
    public static RobotMap robotmap;
    public static RollerGrabberSub roller_grab;
    public static Climer_Sub CLIMBER_SUB;
    public static NetworkTable table;
    public static CommandGroup auto;
    public static CameraServer cam;
    public static VideoSource vid;
   public void robotInit() {
	   
	   
	   
    	cam = CameraServer.getInstance();
    	cam.startAutomaticCapture(0);
    	
 
    	
    	
        table = NetworkTable.getTable("NET_TABLE");
    	CLIMBER_SUB = new Climer_Sub();
        dump_lift = new DumpLiftSub();
        robotmap = new RobotMap();
        roller_grab = new RollerGrabberSub();
        oi = new OI();
try{DRIVE_SUB = new DriveSubsystem();} catch(Exception e){System.out.println(e);}
 
        NetworkTables();
    }

    public void disabledInit() {

    }

    public void autonomousInit() {
//input2= true;
    	//Scheduler.getInstance().add(new DumpUpCommand());
    	if(input1 == true){
    		auto = new AutoMid();
    			}
    			if(input2 == true){
    		auto = new AutoLeft();
    			}
    			if(input3 == true){
    		auto = new AutoRight();
    			}
    		if(auto != null){
    				auto.start();
    				System.out.print("Auto");}
    		
    Robot.DRIVE_SUB.tank(-.6,- .6);
    Timer.delay(4);
    Robot.DRIVE_SUB.tank(0, 0);
    		
    		
    			
    }

    public void teleopInit() {
    //	if (auto.isRunning()){
//auto.cancel();
}
    //}

    public void robotPeriodic() {

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();

    }

    public void autonomousPeriodic() {
    	NetworkTables();
        Scheduler.getInstance().run();

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        oi.updateSensors();
        int check = oi.EncoderValue();
        NetworkTables();
    }
public void NetworkTables(){
		
		table.putBoolean("ROBOT_ON", true);
		table.putBoolean("AutoLeftTrue", autoL);
		table.putBoolean("AutoRightRight", autoR);
		table.putBoolean("AutoMid", autoM);
		//input2 = table.getBoolean("inputL");
		//input3 = table.getBoolean("inputR");
		//input1 = table.getBoolean("autoM");
		table.putValue("Yaw", oi.ahrs.getDisplacementX());
		
		
	}

}
