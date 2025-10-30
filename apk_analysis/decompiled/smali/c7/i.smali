.class public final Lc7/i;
.super Lc7/g;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ll6/h;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lc7/i;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lc7/i;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2, p3}, Ll6/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    iput p1, p0, Lc7/i;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Ll6/h;-><init>(Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lc7/i;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Ll6/h;-><init>(Ljava/lang/String;)V

    .line 8
    iput p2, p0, Lc7/i;->a:I

    return-void
.end method
