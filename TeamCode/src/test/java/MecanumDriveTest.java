import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.*;

import com.ftc16626.missioncontrol.math.Vector2;
import com.ftc16626.missioncontrol.math.kinematics.Kinematics;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.hardware.Dimensions;
import org.firstinspires.ftc.teamcode.hardware.MecanumDrive;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.openftc.revextensions2.ExpansionHubEx;
import org.openftc.revextensions2.ExpansionHubMotor;


public class MecanumDriveTest {

  double encoderCountsPerRev = 386.3 * 2;
  double gearRatio = 1;
  double wheelRadius = 100 / 2;
  public final Dimensions dimensionsDriveTrain = new Dimensions(198.125, 336, 50);
  double length = dimensionsDriveTrain.getLength();
  double width = dimensionsDriveTrain.getWidth();
  final String[] motorIds = new String[]{
      "motorFrontLeft", "motorFrontRight",
      "motorBackLeft", "motorBackRight"
  };

  // Object under test
  MecanumDrive mecanumDrive;

  // Mock objects
  @Mock
  HardwareMap mMockHwMap;

  @Mock
  ExpansionHubEx mMockExpansionHubMain;
  //ExpansionHubEx expansionHubMain = hwMap.get(ExpansionHubEx.class, "Expansion Hub 9");

  @Mock
  ExpansionHubMotor mMockExpansionHubMotor;
  //(ExpansionHubMotor) hwMap.dcMotor.get(motorFrontLeftId);


  @Before
  public void initializeBeforeEachTest() {
    MockitoAnnotations.initMocks(this);
//    when(mMockHwMap.dcMotor.get(anyString())).thenReturn(mMockExpansionHubMotor);

    mecanumDrive= new MecanumDrive(mMockHwMap,mMockExpansionHubMain,
        motorIds[0], motorIds[1], motorIds[2], motorIds[3],
        true,
        dimensionsDriveTrain.getWidth(), dimensionsDriveTrain.getHeight(), wheelRadius,
        gearRatio, encoderCountsPerRev);
  }


  @Test
  public void classCreationTest() {

    assertThat(mecanumDrive).isNotNull();

    Vector2 position = mecanumDrive.getPosition();
    Double heading = mecanumDrive.getHeading();
    assertThat(position).isNotNull();

  }
}
