package com.example.demo.member;

public class MemberServiceIImpl implements MemberService {

	private final MemberRepository memberRepository;

	public MemberServiceIImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}

}
