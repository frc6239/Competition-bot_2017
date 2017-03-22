
  // IntelliJ API Decompiler stub source generated from a class file
  // Implementation of methods is not available

package org.usfirst.frc.team6239.robot;

  import com.ctre.CANTalon;
  import edu.wpi.first.wpilibj.Spark;

  public class RobotMap {
    public static int LeftMotor1 = 3;
    public static int LeftMotor2 = 2;
    public static int RightMotor1 = 0;
    public static int RightMotor2 = 1;
    public static int DumpTalonPort = 0;
    public static int RearDumpTalonPort = 3;
    public static int ClimbTal = 1;
    public static int RollerGrab = 2;
    public double curAngle;
    public boolean limitswitch1;
    public boolean limitswitch2;
    public boolean limitswitch3;
    public boolean limitswitch4;
    public boolean dumperUp;
    public boolean isSeen;
    public boolean driving;

    public CANTalon ClimbTalon;
    public CANTalon DumpTalon;
    public CANTalon RearDumpTalon;

    public CANTalon RollerGrabTal;
    public Spark LeftController1;
    public Spark LeftController2;
    public Spark RightController1;
    public Spark RightController2;
    public RobotMap() {
      RearDumpTalon = new CANTalon(RearDumpTalonPort);
      LeftController1 = new Spark(LeftMotor1);
      LeftController2 = new Spark(LeftMotor2);
      RightController1 = new Spark(RightMotor1);
      RightController2 = new Spark(RightMotor2);
      DumpTalon = new CANTalon(DumpTalonPort);
      ClimbTalon = new CANTalon(ClimbTal);
      RollerGrabTal = new CANTalon(RollerGrab); }
}