.class public final Lm0/d;
.super Lm0/b;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    sget-object p1, Lm0/a;->b:Lm0/a;

    invoke-direct {p0, p1}, Lm0/d;-><init>(Lm0/b;)V

    return-void
.end method

.method public constructor <init>(Lm0/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lm0/b;-><init>()V

    .line 3
    iget-object v0, p0, Lm0/b;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lm0/b;->a:Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
