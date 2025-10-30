.class public final Ld0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/i;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ld0/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls6/n;)V
    .locals 3

    .line 1
    new-instance v0, Lx6/b;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v1, Ld0/o;

    const/16 v2, 0xf

    .line 4
    invoke-direct {v1, v2}, Ld0/o;-><init>(I)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object v0, p0, Ld0/f;->b:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld0/f;->c:Ljava/lang/Object;

    .line 8
    iput-object v1, p0, Ld0/f;->a:Ljava/lang/Object;

    .line 9
    new-instance v0, Lu6/a;

    invoke-direct {v0, p0}, Lu6/a;-><init>(Ld0/f;)V

    invoke-virtual {p1, v0}, Ls6/n;->a(LS6/a;)V

    return-void
.end method
