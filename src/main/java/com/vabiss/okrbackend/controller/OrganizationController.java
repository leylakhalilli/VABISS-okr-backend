package com.vabiss.okrbackend.controller;

import com.vabiss.okrbackend.dto.OrganizationDto;
import com.vabiss.okrbackend.dto.SuccessResponseDto;
import com.vabiss.okrbackend.service.inter.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    private final OrganizationService organizationService;

    @PutMapping("/{organizationId}")
    public ResponseEntity<SuccessResponseDto> updateOrganization(@PathVariable int organizationId,
                                                                 @RequestBody OrganizationDto organizationDto) {
        OrganizationDto organizationDto1 = organizationService.updateOrganization(organizationId, organizationDto);

        return ResponseEntity.ok(SuccessResponseDto.of("Org updated", organizationDto1));
    }

}
