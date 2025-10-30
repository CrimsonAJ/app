.class public final LG2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/VoteResponse;

    .line 2
    .line 3
    const-string v0, "dto"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LH2/z;

    .line 9
    .line 10
    iget v1, p1, Lcom/anilab/data/model/response/VoteResponse;->a:I

    .line 11
    .line 12
    iget p1, p1, Lcom/anilab/data/model/response/VoteResponse;->b:I

    .line 13
    .line 14
    invoke-direct {v0, v1, p1}, LH2/z;-><init>(II)V

    .line 15
    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
