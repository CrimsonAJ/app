.class public final Lco/notix/lo;
.super Lco/notix/mo;
.source "SourceFile"


# instance fields
.field public final a:J


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lco/notix/lo;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lco/notix/mo;-><init>(I)V

    iput-wide p1, p0, Lco/notix/lo;->a:J

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 4

    int-to-long v0, p1

    const-wide/16 v2, 0x7d0

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lco/notix/lo;->a:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-wide v2

    :cond_0
    return-wide v0
.end method
