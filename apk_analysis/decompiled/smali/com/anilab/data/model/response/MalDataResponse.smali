.class public final Lcom/anilab/data/model/response/MalDataResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lo7/l;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Lcom/anilab/data/model/response/MalListStatusResponse;

.field public final b:Lcom/anilab/data/model/response/MalNodeResponse;


# direct methods
.method public constructor <init>(Lcom/anilab/data/model/response/MalListStatusResponse;Lcom/anilab/data/model/response/MalNodeResponse;)V
    .locals 1
    .param p1    # Lcom/anilab/data/model/response/MalListStatusResponse;
        .annotation runtime Lo7/i;
            name = "list_status"
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/response/MalNodeResponse;
        .annotation runtime Lo7/i;
            name = "node"
        .end annotation
    .end param

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/anilab/data/model/response/MalDataResponse;->b:Lcom/anilab/data/model/response/MalNodeResponse;

    .line 12
    .line 13
    return-void
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final copy(Lcom/anilab/data/model/response/MalListStatusResponse;Lcom/anilab/data/model/response/MalNodeResponse;)Lcom/anilab/data/model/response/MalDataResponse;
    .locals 1
    .param p1    # Lcom/anilab/data/model/response/MalListStatusResponse;
        .annotation runtime Lo7/i;
            name = "list_status"
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/response/MalNodeResponse;
        .annotation runtime Lo7/i;
            name = "node"
        .end annotation
    .end param

    const-string v0, "node"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/anilab/data/model/response/MalDataResponse;

    invoke-direct {v0, p1, p2}, Lcom/anilab/data/model/response/MalDataResponse;-><init>(Lcom/anilab/data/model/response/MalListStatusResponse;Lcom/anilab/data/model/response/MalNodeResponse;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/anilab/data/model/response/MalDataResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/anilab/data/model/response/MalDataResponse;

    iget-object v1, p1, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    iget-object v3, p0, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/anilab/data/model/response/MalDataResponse;->b:Lcom/anilab/data/model/response/MalNodeResponse;

    iget-object p1, p1, Lcom/anilab/data/model/response/MalDataResponse;->b:Lcom/anilab/data/model/response/MalNodeResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/anilab/data/model/response/MalListStatusResponse;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/anilab/data/model/response/MalDataResponse;->b:Lcom/anilab/data/model/response/MalNodeResponse;

    invoke-virtual {v1}, Lcom/anilab/data/model/response/MalNodeResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MalDataResponse(listStatus="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", node="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MalDataResponse;->b:Lcom/anilab/data/model/response/MalNodeResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
