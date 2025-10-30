.class public final Lcom/anilab/data/model/response/UserInfoResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lo7/l;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Lcom/anilab/data/model/response/UserResponse;


# direct methods
.method public constructor <init>(Lcom/anilab/data/model/response/UserResponse;)V
    .locals 1
    .param p1    # Lcom/anilab/data/model/response/UserResponse;
        .annotation runtime Lo7/i;
            name = "user"
        .end annotation
    .end param

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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


# virtual methods
.method public final copy(Lcom/anilab/data/model/response/UserResponse;)Lcom/anilab/data/model/response/UserInfoResponse;
    .locals 1
    .param p1    # Lcom/anilab/data/model/response/UserResponse;
        .annotation runtime Lo7/i;
            name = "user"
        .end annotation
    .end param

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/anilab/data/model/response/UserInfoResponse;

    invoke-direct {v0, p1}, Lcom/anilab/data/model/response/UserInfoResponse;-><init>(Lcom/anilab/data/model/response/UserResponse;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/anilab/data/model/response/UserInfoResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/anilab/data/model/response/UserInfoResponse;

    iget-object v1, p0, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    iget-object p1, p1, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    invoke-virtual {v0}, Lcom/anilab/data/model/response/UserResponse;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UserInfoResponse(user="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
