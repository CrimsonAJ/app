.class public final LA8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/k;


# static fields
.field public static final b:Li8/A;


# instance fields
.field public final a:Lo7/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Li8/A;->d:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v0, "application/json; charset=UTF-8"

    .line 4
    .line 5
    invoke-static {v0}, LM4/a;->o(Ljava/lang/String;)Li8/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LA8/b;->b:Li8/A;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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
.end method

.method public constructor <init>(Lo7/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA8/b;->a:Lo7/k;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lx8/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo7/p;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lo7/p;-><init>(Lx8/g;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LA8/b;->a:Lo7/k;

    .line 12
    .line 13
    invoke-virtual {v2, v1, p1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, Lx8/g;->b:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lx8/g;->j0(J)Lx8/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "content"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Li8/H;

    .line 28
    .line 29
    sget-object v1, LA8/b;->b:Li8/A;

    .line 30
    .line 31
    invoke-direct {v0, v1, p1}, Li8/H;-><init>(Li8/A;Lx8/j;)V

    .line 32
    .line 33
    .line 34
    return-object v0
    .line 35
    .line 36
    .line 37
    .line 38
.end method
