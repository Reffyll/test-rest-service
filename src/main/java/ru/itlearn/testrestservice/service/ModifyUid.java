package ru.itlearn.testrestservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.itlearn.testrestservice.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response) {

        response.setUid("New Uid");

        return response;

    }
}
