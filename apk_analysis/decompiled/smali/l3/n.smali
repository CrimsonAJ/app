.class public final Ll3/n;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:Lj3/M;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lj3/M;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Ll3/n;->a:Lj3/M;

    return-void
.end method

.method public constructor <init>(Ll3/i;Lj3/M;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Ll3/n;->a:Lj3/M;

    return-void
.end method
