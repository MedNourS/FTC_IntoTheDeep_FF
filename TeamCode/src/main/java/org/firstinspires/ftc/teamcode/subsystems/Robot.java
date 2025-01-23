package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {
    
    public DriveSubsystem driveSubsystem;

    /**
     * Constructor for the Robot class.
     *
     * @param hardwareMap The hardware map for the robot, granted by the OpMode, used to initialize hardware devices.
     */
    public Robot(HardwareMap hardwareMap) {
        driveSubsystem = new DriveSubsystem(hardwareMap);
    }

    /**
     * Initializes the hardware devices for the robot.
     */
    public void init() {
        driveSubsystem.init();
    }
}
