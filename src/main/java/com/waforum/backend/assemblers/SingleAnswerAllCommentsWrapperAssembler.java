package com.waforum.backend.assemblers;

import com.waforum.backend.controllers.CommentsController;
import com.waforum.backend.controllers.PostsController;
import com.waforum.backend.controllers.UserProfileController;
import com.waforum.backend.models.SingleAnswerAllCommentsWrapper;
import com.waforum.backend.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

public class SingleAnswerAllCommentsWrapperAssembler implements RepresentationModelAssembler<SingleAnswerAllCommentsWrapper, EntityModel<SingleAnswerAllCommentsWrapper>> {
    @Autowired
    PostsRepository postsRepository;
    @Override
    public EntityModel<SingleAnswerAllCommentsWrapper> toModel(SingleAnswerAllCommentsWrapper entity) {
        return EntityModel.of(entity,
                linkTo(methodOn(CommentsController.class).getCommentsByAnswerId(entity.getAnswer().getId())).withSelfRel(),
                linkTo(methodOn(PostsController.class).getAnswerByIdByQuestionId(postsRepository.findAllByParentId(entity.getAnswer().getParentId()).get(0).getId(),
                        entity.getAnswer().getParentId())).withRel("answers"),
                linkTo(methodOn(UserProfileController.class).getProfileInfoById(entity.getAnswer().getOwnerUserId())).withRel("answeredBy"));
    }
}
