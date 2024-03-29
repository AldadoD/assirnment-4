package com.aldado.principles.srp.Violate;

public class Navigator {

    public Position navigate(Position position, Direction direction) {
        Position nextPosition = resolve(position,direction);
        Position fixedPosition =fix(nextPosition);
        return fixedPosition;
    }
    public Position resolve(Position position,Direction direction) {
        switch (direction) {
            case N:
                return new Position(position.getxAxis(),position.getyAxis()+1);
            case S:
                return new Position(position.getxAxis(),position.getyAxis()-1);
            case W:
                return new Position(position.getxAxis()-1,position.getyAxis());
            case E:
                return new Position(position.getxAxis()+1,position.getyAxis());
            default:
                throw new IllegalArgumentException();
        }
    }
    public Position fix(Position position) {
        return new Position(
                position.getxAxis()<0?0:position.getxAxis(),
                position.getyAxis()<0?0:position.getyAxis()
        );
    }

}
