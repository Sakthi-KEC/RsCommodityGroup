//package net.microservices.RsCommodityGroup;
//
//import net.microservices.RsCommodityGroup.controller.RsCommodityGroupController;
//import net.microservices.RsCommodityGroup.dto.RsCommodityGroupDto;
//import net.microservices.RsCommodityGroup.service.RsCommodityGroupService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.reactive.server.WebTestClient;
//import static org.junit.Assert.assertEquals;
//
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//import reactor.test.StepVerifier;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringRunner.class)
//@WebFluxTest(controllers = RsCommodityGroupController.class)
//@Import(RsCommodityGroupService.class)
//class RsRsCommodityGroupApplicationTests {
//
//	@Autowired
//	private WebTestClient webTestClient;
//	@MockBean
//	private RsCommodityGroupService service;
//	@Test
//	public void addProductTest() {
//		Mono<RsCommodityGroupDto> productDtoMono = Mono.just(new RsCommodityGroupDto("1","Shoe","JKR","12-08-2021"));
//		when(service.addCommodityGroup(productDtoMono)).thenReturn(productDtoMono);
//
//		webTestClient.post().uri("/commoditygroup")
//				.body(Mono.just(productDtoMono),RsCommodityGroupDto.class)
//				.exchange()
//				.expectStatus().isOk();//200
//
//	}
//	@Test
//	public void getProductsTest(){
//		Flux<RsCommodityGroupDto> productDtoFlux=Flux.just(new  RsCommodityGroupDto("1","Shoe","JKR","12-08-2021"));
//
//		when(service.getAllCommodityGroup()).thenReturn(productDtoFlux);
//
//		Flux<RsCommodityGroupDto> responseBody = webTestClient.get().uri("/commoditygroup")
//				.exchange()
//				.expectStatus().isOk()
//				.returnResult(RsCommodityGroupDto.class)
//				.getResponseBody();
//
//		StepVerifier.create(responseBody)
//				.expectSubscription()
//				.expectNext(new  RsCommodityGroupDto("1","Shoe","JKR","12-08-2021"))
//				.verifyComplete();
//
//	}
//	@Test
//	public void getGroupCodeTest(){
//		Mono<RsCommodityGroupDto> productDtoFlux=Mono.just(new  RsCommodityGroupDto("1","Shoe","JKR","12-08-2021"));
//
//		when(service.getCommodityGroupByCode("1")).thenReturn(productDtoFlux);
//
//		Flux<RsCommodityGroupDto> responseBody = webTestClient.get().uri("/commoditygroup/groupcode/1")
//				.exchange()
//				.expectStatus().isOk()
//				.returnResult(RsCommodityGroupDto.class)
//				.getResponseBody();
//
//		StepVerifier.create(responseBody)
//				.expectSubscription()
//				.expectNextMatches(p->p.getCommodityGroupCode().equals("1"))
//				.verifyComplete();
//
//	}
//	@Test
//	public void getGroupNameTest(){
//		Mono<RsCommodityGroupDto> productDtoFlux=Mono.just(new  RsCommodityGroupDto("1","Shoe","JKR","12-08-2021"));
//
//		when(service.getCommodityGroupByName("Shoe")).thenReturn(productDtoFlux);
//
//		Flux<RsCommodityGroupDto> responseBody = webTestClient.get().uri("/commoditygroup/groupname/Shoe")
//				.exchange()
//				.expectStatus().isOk()
//				.returnResult(RsCommodityGroupDto.class)
//				.getResponseBody();
//
//		StepVerifier.create(responseBody)
//				.expectSubscription()
//				.expectNextMatches(p->p.getCommodityGroupName().equals("Shoe"))
//				.verifyComplete();
//
//	}
//
//
//}
