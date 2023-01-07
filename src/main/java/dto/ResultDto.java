package dto;

public class ResultDto {
    private BallDto ballDto;
    private StrikeDto strikeDto;

    public ResultDto(BallDto ballDto, StrikeDto strikeDto) {
        this.ballDto = ballDto;
        this.strikeDto = strikeDto;
    }

    public BallDto getBallDto() {
        return ballDto;
    }

    public StrikeDto getStrikeDto() {
        return strikeDto;
    }
}
