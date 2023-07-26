package org.astro.aboard.service;

import org.apache.ibatis.annotations.Param;
import org.astro.aboard.dto.PageRequestDTO;
import org.astro.aboard.dto.PageResponseDTO;
import org.astro.aboard.dto.ReplyDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ReplyService {

    PageResponseDTO<ReplyDTO> replyList(@Param("page") PageRequestDTO pageRequestDTO, @Param("bno") long bno);

    ReplyDTO readReply(long rno);

    Long insertReply(ReplyDTO replyDTO);

    int deleteReply(long rno);

    int modifyReply(ReplyDTO replyDTO);
    
}
