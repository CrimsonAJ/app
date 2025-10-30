.class public final LZ/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/LinkedHashSet;

.field public static final f:LQ6/f;


# instance fields
.field public final a:Lx8/u;

.field public final b:LO7/p;

.field public final c:Lb0/e;

.field public final d:LA7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ/f;->e:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    new-instance v0, LQ6/f;

    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-direct {v0, v1}, LQ6/f;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LZ/f;->f:LQ6/f;

    .line 16
    .line 17
    return-void
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
.end method

.method public constructor <init>(Lx8/u;Lb0/e;)V
    .locals 2

    .line 1
    sget-object v0, LZ/d;->d:LZ/d;

    .line 2
    .line 3
    const-string v1, "fileSystem"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LZ/f;->a:Lx8/u;

    .line 12
    .line 13
    iput-object v0, p0, LZ/f;->b:LO7/p;

    .line 14
    .line 15
    iput-object p2, p0, LZ/f;->c:Lb0/e;

    .line 16
    .line 17
    new-instance p1, LZ/e;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-direct {p1, p0, p2}, LZ/e;-><init>(LZ/f;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LZ/f;->d:LA7/l;

    .line 28
    .line 29
    return-void
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
