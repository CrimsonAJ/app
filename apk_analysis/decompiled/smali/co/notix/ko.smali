.class public final Lco/notix/ko;
.super Lco/notix/mo;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-direct {p0, p1, p2, v0, v1}, Lco/notix/ko;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lco/notix/mo;-><init>(I)V

    iput-wide p1, p0, Lco/notix/ko;->a:J

    iput-wide p3, p0, Lco/notix/ko;->b:J

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 6

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-wide v0, p0, Lco/notix/ko;->a:J

    long-to-double v0, v0

    add-int/lit8 p1, p1, -0x1

    int-to-double v2, p1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double/2addr v2, v0

    double-to-long v0, v2

    iget-wide v2, p0, Lco/notix/ko;->b:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    return-wide v2

    :cond_1
    return-wide v0
.end method
