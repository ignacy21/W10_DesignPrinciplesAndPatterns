package Structural_Design_Patterns.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarFactoryFacade {

    private FrameAssembler frameAssembler;
    private Painter painter;
    private EngineMaker engineMaker;
    private CockpitEssembler cockpitEssembler;
    private DoorMaker doorMaker;
    private SeatMaker seatMaker;
    private WheelsProducer wheelsProducer;

    public void produceCar() {
        frameAssembler.assembleFrame();
        painter.paintSkeleton();
        engineMaker.fastenEngine();
        cockpitEssembler.mountCockpit();
        doorMaker.installDoors();
        seatMaker.attachSeats();
        wheelsProducer.attatchWheels();

    }
}
