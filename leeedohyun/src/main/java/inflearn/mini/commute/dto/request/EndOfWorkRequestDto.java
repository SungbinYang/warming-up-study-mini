package inflearn.mini.commute.dto.request;

import jakarta.validation.constraints.NotNull;

public record EndOfWorkRequestDto(@NotNull(message = "직원 ID는 필수입니다.") Long employeeId) {
}
