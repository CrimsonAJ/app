.class public final LC3/s;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:LC3/p;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj3/M;LC3/y;ZI)V
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Decoder init failed: ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p1, Lj3/M;->l:Ljava/lang/String;

    if-gez p4, :cond_0

    .line 2
    const-string p1, "neg_"

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p2

    move v6, p3

    .line 5
    invoke-direct/range {v2 .. v8}, LC3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLC3/p;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLC3/p;Ljava/lang/String;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    iput-object p3, p0, LC3/s;->a:Ljava/lang/String;

    .line 8
    iput-boolean p4, p0, LC3/s;->b:Z

    .line 9
    iput-object p5, p0, LC3/s;->c:LC3/p;

    .line 10
    iput-object p6, p0, LC3/s;->d:Ljava/lang/String;

    return-void
.end method
