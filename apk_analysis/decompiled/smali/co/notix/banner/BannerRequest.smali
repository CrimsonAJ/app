.class public final Lco/notix/banner/BannerRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final experiment:Ljava/lang/Integer;

.field private final placement:Ljava/lang/String;

.field private final refreshIntervalMillis:J

.field private final size:Lco/notix/banner/BannerSize;

.field private final zoneId:J


# direct methods
.method public constructor <init>(JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;J)V
    .locals 1

    .line 1
    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    iput-object p3, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    iput-object p4, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    iput-object p5, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    iput-wide p6, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    return-void
.end method

.method public synthetic constructor <init>(JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_2

    const-wide/32 p6, 0xea60

    :cond_2
    move-wide p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    .line 2
    invoke-direct/range {p1 .. p8}, Lco/notix/banner/BannerRequest;-><init>(JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;J)V

    return-void
.end method

.method public static synthetic copy$default(Lco/notix/banner/BannerRequest;JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;JILjava/lang/Object;)Lco/notix/banner/BannerRequest;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    iget-wide p6, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    :cond_4
    move-object v0, p0

    move-wide v6, p6

    invoke-virtual/range {v0 .. v7}, Lco/notix/banner/BannerRequest;->copy(JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;J)Lco/notix/banner/BannerRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    return-wide v0
.end method

.method public final component2()Lco/notix/banner/BannerSize;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    return-wide v0
.end method

.method public final copy(JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;J)Lco/notix/banner/BannerRequest;
    .locals 9

    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lco/notix/banner/BannerRequest;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lco/notix/banner/BannerRequest;-><init>(JLco/notix/banner/BannerSize;Ljava/lang/String;Ljava/lang/Integer;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/notix/banner/BannerRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/notix/banner/BannerRequest;

    iget-wide v3, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    iget-wide v5, p1, Lco/notix/banner/BannerRequest;->zoneId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    iget-object v3, p1, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    iget-object v3, p1, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    iget-object v3, p1, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    iget-wide v5, p1, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getExperiment()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPlacement()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    return-object v0
.end method

.method public final getRefreshIntervalMillis()J
    .locals 2

    iget-wide v0, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    return-wide v0
.end method

.method public final getSize()Lco/notix/banner/BannerSize;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    return-object v0
.end method

.method public final getZoneId()J
    .locals 2

    iget-wide v0, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 7

    .line 1
    iget-wide v0, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v3, v0, v2

    .line 6
    .line 7
    xor-long/2addr v0, v3

    .line 8
    long-to-int v0, v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    move v0, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :goto_0
    add-int/2addr v1, v0

    .line 32
    mul-int/lit8 v1, v1, 0x1f

    .line 33
    .line 34
    iget-object v0, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    :goto_1
    add-int/2addr v1, v3

    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    iget-wide v3, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    .line 47
    .line 48
    ushr-long v5, v3, v2

    .line 49
    .line 50
    xor-long/2addr v3, v5

    .line 51
    long-to-int v0, v3

    .line 52
    add-int/2addr v0, v1

    .line 53
    return v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BannerRequest(zoneId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lco/notix/banner/BannerRequest;->zoneId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/notix/banner/BannerRequest;->size:Lco/notix/banner/BannerSize;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/notix/banner/BannerRequest;->placement:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", experiment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/notix/banner/BannerRequest;->experiment:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", refreshIntervalMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/notix/banner/BannerRequest;->refreshIntervalMillis:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
