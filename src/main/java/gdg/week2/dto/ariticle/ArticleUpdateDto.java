package gdg.week2.dto.ariticle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleUpdateDto {
    private String content; // 수정할 내용
}
