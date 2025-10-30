.class public final Lco/notix/lsi/LsiInterval$Fixed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/lsi/LsiInterval;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/lsi/LsiInterval;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Fixed"
.end annotation


# instance fields
.field private final intervalMillis:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    return-void
.end method

.method public static synthetic copy$default(Lco/notix/lsi/LsiInterval$Fixed;JILjava/lang/Object;)Lco/notix/lsi/LsiInterval$Fixed;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/notix/lsi/LsiInterval$Fixed;->copy(J)Lco/notix/lsi/LsiInterval$Fixed;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    return-wide v0
.end method

.method public final copy(J)Lco/notix/lsi/LsiInterval$Fixed;
    .locals 1

    new-instance v0, Lco/notix/lsi/LsiInterval$Fixed;

    invoke-direct {v0, p1, p2}, Lco/notix/lsi/LsiInterval$Fixed;-><init>(J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/notix/lsi/LsiInterval$Fixed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/notix/lsi/LsiInterval$Fixed;

    iget-wide v3, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    iget-wide v5, p1, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getIntervalMillis()J
    .locals 2

    iget-wide v0, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fixed(intervalMillis="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lco/notix/lsi/LsiInterval$Fixed;->intervalMillis:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
